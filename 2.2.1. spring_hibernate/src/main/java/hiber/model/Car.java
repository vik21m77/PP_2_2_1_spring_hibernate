package hiber.model;

import javax.persistence.*;

@Entity
@Table(name = "cars")
public class Car {

    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    @Column(name = "series")
    private int series;

    @NotNull
    @Column(name = "model")
    private String model;

    public Car() {

    }

    public Car(int series, String model, User user) {
        this.series = series;
        this.model = model;
        this.user = user;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", series=" + series +
                ", model='" + model + '\'' +
                '}';
    }
}
