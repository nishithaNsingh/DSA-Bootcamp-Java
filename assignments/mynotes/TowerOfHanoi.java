public class TowerOfHanoi {
    public static void main(String[] args){
        towerOfHanoi(3,'A','B','C');

    }
    public static void towerOfHanoi(int n,char src,char dest , char aux){
        if (n==1){
            System.out.println(src+"-->"+dest);
            return;
        }
        towerOfHanoi(n-1,src,aux,dest);
        towerOfHanoi(1,src,dest,aux);
        towerOfHanoi(n-1,aux,dest,src);
    }
}
