public class AccendingOrder {
    public static void main(String[] args) {
        int a[]={9,8,7,6,5};
        int t;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
            }
        }

        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
