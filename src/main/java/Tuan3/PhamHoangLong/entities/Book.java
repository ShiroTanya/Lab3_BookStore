package Tuan3.PhamHoangLong.entities;

//import javax.validation.constraints.Min;
//import javax.validation.constraints.NotBlank;
//import javax.validation.constraints.NotNull;
//import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    private Long id;

//    @NotBlank(message = "Thiếu thông tin Title")
//    @Size(min = 2, max = 100, message = "Title phải từ 2 đến 100 ký tự")
    private String title;
    private String author;
    private Double price;
    private String category;
}