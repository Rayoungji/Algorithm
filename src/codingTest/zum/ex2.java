package codingTest.zum;

import java.util.*;

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
