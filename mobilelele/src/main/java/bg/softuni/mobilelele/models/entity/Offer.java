package bg.softuni.mobilelele.models.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "offers")
public class Offer extends BaseEntity {

    @Column(columnDefinition = "text")
    private String description;
    @Column
    @Enumerated(EnumType.STRING)
    private Engine engine;
    @Column(name = "image_url")
    private String imageUrl;
    @Column
    private int mileage;
    @Column(columnDefinition = "decimal(19,2)")
    private BigDecimal price;
    @Column
    private Transmission transmission;
    @Column
    private int year;
    @Column
    private LocalDateTime created;
    @Column
    private LocalDateTime modified;
    @ManyToOne
    @JoinColumn(name = "model_id",referencedColumnName = "id")
    private Model model;
    @ManyToOne
    @JoinColumn(name = "seller_id",referencedColumnName = "id")
    private User seller;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public LocalDateTime getModified() {
        return modified;
    }

    public void setModified(LocalDateTime modified) {
        this.modified = modified;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public User getSeller() {
        return seller;
    }

    public void setSeller(User user) {
        this.seller = user;
    }
}
