package com.example.ecommercespring.CategoryController;
import com.example.ecommercespring.dto.CategoryDTO;
import com.example.ecommercespring.service.ICategoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.io.IOException;
import java.util.List;


@RestController
@RequestMapping("api/categories")
public class CategoryController {


    private final ICategoryService categoryService;


    CategoryController(ICategoryService _categoryService){    // Dependency Injection (constructor based)
        this.categoryService = _categoryService;
    }

    /***********Internally Happened this thing when constructor call

    UserServiceImpl serviceBean = new UserServiceImpl();

    UserController controller = new UserController(serviceBean);

    *********************/

    @GetMapping
    public ResponseEntity<List<CategoryDTO>> getAllCategories() throws IOException {

        List<CategoryDTO> result = this.categoryService.getAllCategories();

        return ResponseEntity.ok(result);
        //return ResponseEntity.created(null).body(result);
    }

}

/*
@RestController: Yeh do cheezon se milkar bana hai—@Controller + @ResponseBody. Iska matlab yeh class web requests sambhalegi aur jo bhi data return karegi, use JSON format me automatic client ko bhej degi.

@RequestMapping("api/categories"): Is controller ka main path/route set karta hai.

@GetMapping: Batata hai ki jab koi GET request karega tabhi yeh method chalega.

ResponseEntity<...>: Yeh HTTP response ko customize karne ke liye hota hai.
Isse hum control kar sakte hain ki client ko HTTP status code kya dikhega
(jaise 200 OK, 404 Not Found, 201 Created).
ResponseEntity.ok(result) ka matlab hai data ke sath Status Code: 200 bhejna.
*/
