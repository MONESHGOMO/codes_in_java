public class String_Performance {
    public static void main(String[] args) {
        String series=" ";

 // ASCII
        for(int i=0;i<26 ;i++){
            char ch=(char)('a'+ i);
             series +=ch;

        }
        System.out.print(series);



    }
}
