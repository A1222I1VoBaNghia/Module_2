package ss4_module2.bai_tap;

import java.util.Date;

public class StopWatch {
    private Date startTime, endTime;
    public StopWatch(){
        startTime = new Date();
    }
    public StopWatch(Date startTime, Date endTime){
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public Date getStartTime(){
        return this.startTime;
    }
    public Date getEndTime(){
        return this.endTime;
    }
    public Date start(){
        return startTime = new Date();
    }
    public Date stop(){
        return endTime = new Date();
    }
    public long getEslapedTime(){
        return endTime.getTime()-startTime.getTime();
    }
    public static void main(String[] args) {
        StopWatch t = new StopWatch();
        t.start();
        System.out.println(t.start());
        double[] arr = new double[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.random();
        }
        double min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(min<=arr[i]){
                min = arr[i];
            }
        }
        t.stop();
        System.out.println("Thời gian thực thi là: "+t.getEslapedTime()+" mili giây");
    }
}
