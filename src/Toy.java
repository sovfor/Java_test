import java.util.logging.StreamHandler;

public class Toy {

    private Integer id;

    private String name;

    private Integer amount;

    private Integer freguency;

    public Toy() {

    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public Integer getAmount(){
        return amount;
    }

    public Integer getFreguency() {
        return freguency;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public void setFreuency(Integer freuency) throws RuntimeException {
        if (freuency >= 100) {
            this.freguency = freuency;

        }
        else{System.err.println("Частота меньше нужной");}

    }

    public String toSring(){
        return  String.format("id: %d \n" +
                "Имя: %s \n " +
                "Количество: %d \n" +
                "Частота: %d"
                ,id,name,amount,freguency);


    }
}