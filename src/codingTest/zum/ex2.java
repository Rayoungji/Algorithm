package codingTest.zum;

import java.util.*;

/**
 * 문제 설명
 * 제임스가 일하는 사무실에는 문서를 한 번에 하나씩 인쇄할 수 있는 프린터 한 대가 있습니다. 혼자 프린터를 사용할 때는 별 문제가 없지만, 여러 사람이 동시에 프린터를 사용할 때는 어떤 문서를 먼저 인쇄할지 정해야 합니다. 일반적인 프린터의 경우 먼저 요청된 문서를 먼저 인쇄하지만, 제임스는 보다 효율적인 일처리를 위해 다음과 같이 프린터가 인쇄 요청을 처리하는 규칙을 정했습니다.
 *
 * 인쇄 중 또는 대기 중인 문서가 없을 때 인쇄 요청된 문서는 즉시 인쇄합니다.
 * 인쇄 중 또는 대기 중인 문서가 있을 때 인쇄 요청된 문서는 대기열에 추가합니다.
 * 인쇄 중인 문서가 전부 인쇄된 후 대기열에서 다음 문서를 선택해 인쇄합니다.
 * 3-1. 대기 중인 문서중 페이지 수가 적은 문서부터 인쇄합니다.
 * 3-2. 대기 중인 문서중 페이지 수가 같은 문서가 있을 경우, 먼저 요청된 문서부터 인쇄합니다.
 * 3-3. 현재 인쇄 중인 문서의 인쇄가 끝난 시각과 새로 요청된 문서의 인쇄 요청 시각이 같은 경우, 새로 요청된 문서를 먼저 대기열에 추가한 후 다음에 인쇄해야 될 문서를 선택합니다.
 * 제임스는 프린터가 규칙대로 작동하는지 테스트하기 위해 가상의 인쇄 요청 데이터를 만들어 입력해보려 합니다. 각 인쇄 요청 데이터는 다음과 같은 형식입니다.
 *
 * [문서 번호, 인쇄 요청 시각, 페이지 수]
 * 단, 인쇄 요청 시각은 0초부터 시작하며, 초 단위로 나타냅니다. 예를 들어 어떤 문서의 인쇄 요청 데이터가 [2, 2, 4]인 경우, 이는 2번 문서가 2초에 인쇄 요청됐으며, 4페이지를 인쇄해야 된다는 의미입니다. 또한 한 페이지를 인쇄하는 데에는 1초가 걸립니다.
 *
 * 인쇄 요청 데이터들이 들어있는 배열 data가 매개변수로 주어질 때, 배열에 인쇄가 완료되는 순서대로 문서 번호를 담아 return 하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * data는 가로(열) 길이가 3, 세로(행) 길이가 1 이상 100,000 이하인 2차원 배열입니다.
 * data의 원소는 [문서 번호, 인쇄 요청 시각, 페이지 수] 형식입니다.
 * 인쇄할 문서가 N개일 때, 모든 문서에는 1부터 N까지 번호가 하나씩 붙어있습니다.
 * data의 각 행은 문서 번호와 인쇄 요청 시각이 증가하는 순서로 주어집니다.
 * 즉, data의 각 행의 문서 번호는 1부터 N까지 오름차순 형태로 주어지며, 번호가 클수록 나중에 인쇄 요청된 문서입니다.
 * 인쇄 요청 시각이 같은 문서는 없습니다.
 * 인쇄 요청 시각은 0 이상 100,000,000 이하인 자연수입니다.
 * 페이지 수는 1 이상 100,000 이하인 자연수입니다.
 * 문서를 대기열에 추가하거나, 다음 인쇄할 문서를 선택하는데 걸리는 시간은 없다고 가정합니다.
 * 입출력 예
 * data	result
 * [[1, 0, 5],[2, 2, 2],[3, 3, 1],[4, 4, 1],[5, 10, 2]]	[1,3,4,2,5]
 * [[1, 0, 3], [2, 1, 3], [3, 3, 2], [4, 9, 1], [5, 10, 2]]	[1,3,2,4,5]
 * [[1, 2, 10], [2, 5, 8], [3, 6, 9], [4, 20, 6], [5, 25, 5]]	[1,2,4,5,3]
 * 입출력 예 설명
 * 입출력 예 #1
 *
 * 문서 데이터
 * 문서 번호	인쇄 요청 시각	페이지 수
 * 1	0	5
 * 2	2	2
 * 3	3	1
 * 4	4	1
 * 5	10	2
 * 작동 상태
 * 시각	인쇄중 문서 번호	대기중 문서 번호
 * 0	1	[]
 * 1	1	[]
 * 2	1	[2]
 * 3	1	[2,3]
 * 4	1	[2,3,4]
 * 5	3	[2,4]
 * 6	4	[2]
 * 7	2	[]
 * 8	2	[]
 * 9	없음	[]
 * 10	5	[]
 * 11	5	[]
 * 1번 문서는 총 5페이지이므로 인쇄에 5초가 걸립니다. 0초에 인쇄를 시작했으므로, 5초가 되는 순간 인쇄가 끝나 다음으로 인쇄할 문서를 고릅니다. 대기열에는 2초, 3초, 4초 때 추가된 [2번, 3번, 4번] 문서가 있습니다. 이 중 다음으로 인쇄할 문서는 가장 페이지수가 적으면서 가장 먼저 요청된 3번 문서입니다. 마찬가지로 나머지 문서도 인쇄하면 [1번, 3번, 4번, 2번, 5번] 문서 순으로 인쇄합니다.
 *
 * 입출력 예 #2
 *
 * 문서 데이터
 * 문서 번호	인쇄 요청 시각	페이지 수
 * 1	0	3
 * 2	1	3
 * 3	3	2
 * 4	9	1
 * 5	10	2
 * 작동 상태
 * 시각	인쇄중 문서 번호	대기중 문서 번호
 * 0	1	[]
 * 1	1	[2]
 * 2	1	[2]
 * 3	3	[2]
 * 4	3	[2]
 * 5	2	[]
 * 6	2	[]
 * 7	2	[]
 * 8	없음	[]
 * 9	4	[]
 * 10	5	[]
 * 11	5	[]
 * 3초에 1번 문서의 인쇄가 끝나는 동시에 3번 문서가 인쇄 요청됐습니다. 3-3 규칙에 의해 먼저 3번 문서를 대기열에 추가합니다. 대기열에는 2번, 3번 문서가 있으며, 이 중 3번 문서의 페이지 수가 더 적으므로, 3번 문서를 인쇄합니다. 3번 문서의 인쇄가 끝난 다음에는 2번 문서를 인쇄합니다. 5번 문서는 4번 문서의 인쇄가 끝나는 순간 요청됐으므로 우선 대기열에 추가합니다. 대기열에 다른 문서가 없으므로 즉시 5번 문서의 인쇄합니다. 따라서 [1번, 3번, 2번, 4번, 5번] 문서 순으로 인쇄합니다.
 *
 * 입출력 예 #3
 *
 * 설명 생략
 */
public class ex2 {

    public int[] solution(int[][] data) {
        List<Integer> answer = new ArrayList<>();

        //시작 시간
        int time = data[0][1];
        //인쇄 중 큐
        Queue<Document> queue = new LinkedList<>();
        //대기 중 큐 -> 페이지 수 기준 정렬 -> 우선 순위 기준 정렬
        PriorityQueue<Document> priorityQueue = new PriorityQueue<>(
                Comparator.comparing(Document::getPage).thenComparing(Document::getRequestTime));

        int index = 0;
        while(answer.size() < data.length) {
            //인쇄 중 x 그리고 대기 중 x
            //인쇄 큐에 넣고 index 증가
            if(queue.isEmpty() && priorityQueue.isEmpty()) {
                queue.offer(new Document(data[index][0], data[index][1], data[index][2]));
                answer.add(data[index][0]);
                index++;
            }
            //인쇄 중 x 그리고 대기 중 o
            //대기 중에서 하나 꺼내서 인쇄 중에 넣는다.
            else if(queue.isEmpty() && !priorityQueue.isEmpty()) {
                Document document = priorityQueue.poll();
                queue.offer(document);
                answer.add(document.number);
            }
            //인쇄 중
            //인쇄 중에서 하나 꺼내서 끝나는 시간 구해주고 그 끝나는 시간보다 앞에있는 요청 싸그리 다 대기 중에 넣어버리기
            else if(!queue.isEmpty()) {
                Document document = queue.poll();
                time += document.page;
                while(index < data.length && data[index][1] <= time) {
                    priorityQueue.offer(new Document(data[index][0], data[index][1], data[index][2]));
                    index++;
                }
            }
        }
        return answer.stream().mapToInt(i -> i).toArray();
    }

    public class Document {
        int number;
        int requestTime;
        int page;

        public int getPage() {
            return page;
        }

        public int getRequestTime() {
            return requestTime;
        }

        public Document(int number, int requestTime, int page) {
            this.number = number;
            this.requestTime = requestTime;
            this.page = page;
        }
    }

    public static int[] solution2(int[][] data) {
        PriorityQueue<PaperQ> pq = new PriorityQueue<>();
        List<Integer> answer = new ArrayList<>();

        pq.add(new PaperQ(data[0][0], data[0][1], data[0][2]));
        int flag = 1;
        int time = data[0][1];


        while(!pq.isEmpty()) {
            PaperQ temp = pq.poll();
            time += temp.pages;
            answer.add(temp.number);

            if(flag < data.length) {
                for (int j = flag; j < data.length; j++) {
                    if (data[j][1] <= time) {
                        flag++;
                        pq.add(new PaperQ(data[j][0], data[j][1], data[j][2]));
                        continue;
                    }
                    break;
                }
                if(pq.isEmpty()) {
                    time = data[flag][1];
                    pq.add(new PaperQ(data[flag][0], data[flag][1], data[flag++][2]));
                }
            }
        }

        if(flag != data.length) {
        }

        return answer.stream().mapToInt(i -> i).toArray();

    }

    public static class PaperQ implements Comparable<PaperQ>{
        int number;
        int time;
        int pages;

        public PaperQ(int number, int time, int pages) {
            this.number = number;
            this.time = time;
            this.pages = pages;
        }

        @Override
        public int compareTo(PaperQ paperQ) {
            if (this.pages > paperQ.pages)
                return 1;
            else if (this.pages < paperQ.pages)
                return -1;
            else if (this.pages == paperQ.pages && this.time > paperQ.time)
                return 1;
            else if (this.pages == paperQ.pages && this.time < paperQ.time)
                return -1;
            return 0;
        }
    }
}
