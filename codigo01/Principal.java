public class Principal{
    public static void main(String[] args){

        //Alunos
        No obj1 = new No("Rafael");
        obj1.setNextNo(new No("Cecília"));
        obj1.getNextNo().setNextNo(new No("Joaquim"));
        obj1.getNextNo().getNextNo().setNextNo(new No("Luis"));

        System.out.println(obj1.getDado());
        System.out.println(obj1.getNextNo().getDado());
        System.out.println(obj1.getNextNo().getNextNo().getDado());
        System.out.println(obj1.getNextNo().getNextNo().getNextNo().getDado());

        No aux = obj1;

        while (aux != null){
            System.out.println(aux.getDado());
            aux = aux.getNextNo();{        
            }
        }
    }
}