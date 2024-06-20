package Tuan4.PhamHoangLong.entities;

import Tuan4.PhamHoangLong.validators.annotation.ValidCategoryId;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;
import org.hibernate.Hibernate;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Data
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "title", length = 50, nullable = false)
    @Size(min = 1, max = 50, message = "Tên sách cần có 1-50 kí tự")
            @NotBlank(message = "Tên sách không được để trống")
            private String title;
            @Column(name = "author", length = 50, nullable = false)
            @Size(min = 1,max = 50, message = "Tên tác giả cần ít nhất 1-50 kí tự")
            @NotBlank(message = "Tác giả không được để trống")
            private String author;
            @Column(name = "price")
            @Positive(message = "Giá sách cần phải lớn hơn 0")
            private Double price;
            @ManyToOne(fetch = FetchType.LAZY)
            @JoinColumn(name = "category_id", referencedColumnName = "id")
    @ValidCategoryId
    @ToString.Exclude
    private Category category;

    @OneToMany(mappedBy = "book", cascade = CascadeType.ALL)
    @ToString.Exclude
    private List<ItemInvoice> itemInvoices = new ArrayList<>();


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) !=
                Hibernate.getClass(o)) return false;
        Book book = (Book) o;
        return getId() != null && Objects.equals(getId(),
                book.getId());
    }
    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}