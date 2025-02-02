public class Exibir {

    public static String exbir(String name){
        int tamanho, metade_tamaho;

        tamanho = name.length();
        metade_tamaho = tamanho / 2;
        String result = "";

        if (tamanho % 2 == 0){
            result += name.charAt(metade_tamaho - 1);
            result += name.charAt(metade_tamaho );

        }else{
            result += name.charAt(metade_tamaho);
        }
        return  result;


    }
    public static void main(String[] args){
        String name = "Messi";
        String result = exbir(name);

        System.out.println(result);

    }

}

