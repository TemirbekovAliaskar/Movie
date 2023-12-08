package movies;

public class Producer {

    private int id;
    private String producerName;
    private String producerLastName;


    public Producer(int id, String producerName, String producerLastName) {
        this.id = id;
        this.producerName = producerName;
        this.producerLastName = producerLastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProducerName() {
        return producerName;
    }

    public void setProducerName(String producerName) {
        this.producerName = producerName;
    }

    public String getProducerLastName() {
        return producerLastName;
    }

    public void setProducerLastName(String producerLastName) {
        this.producerLastName = producerLastName;
    }

    @Override
    public String toString() {
        return "           Producer       " +
                "💡 id :" + id +
                " producerName : " + producerName + "\n" +
                " producerLastName : " + producerLastName + "\n" +
                ';';
    }
}
