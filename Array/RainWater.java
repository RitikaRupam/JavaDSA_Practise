package Array;

public class RainWater {
    public static void main(String[] args) {
        int pillars[]={0,1,0,2,1,0,1,3,2,1,2,1};
        int maxLeft[]=new int[pillars.length];
        int maxRight[]=new int[pillars.length];
        maxLeft[0]=pillars[0];
        maxRight[0]=pillars[0];
        int result=0;
        if(pillars.length==0){
            System.out.println("No Pillars Present");
        }
        //Left Max Pillar
        for(int i=0;i<pillars.length;i++){
            maxLeft[i]=Math.max(maxLeft[i-1], pillars[i]);
        }
        //Right Max Pillar
        for(int i=pillars.length-1;i>=0;i--){
          
        }
        int decisionPillar=Math.min(max, min);
        for(int i=0;i<pillars.length;i++){
            if(decisionPillar>pillars[i]){
               result= decisionPillar-pillars[i];
            }
        }
        System.out.println(result);
    }
}
