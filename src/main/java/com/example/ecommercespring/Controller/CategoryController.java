package com.example.ecommercespring.Controller;
import com.example.ecommercespring.dto.CategoryDTO;
import com.example.ecommercespring.dto.FakeStoreCategoryResponseDTO;
import com.example.ecommercespring.service.ICategoryService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("api/categories")
public class CategoryController {

    private final ICategoryService categoryService;

    CategoryController(@Qualifier("dbCategoryService") ICategoryService categoryService){    // Dependency Injection (constructor based)
        this.categoryService = categoryService;
    }
    /*********** Internally Happened this thing when constructor call

    UserServiceImpl serviceBean = new UserServiceImpl();

    UserController controller = new UserController(serviceBean);

    *********************/

    @GetMapping
    public ResponseEntity<?> getAllCategories(@RequestParam(required = false) String name) throws Exception {

        if(name != null &&  !name.isBlank()){
            CategoryDTO categoryDTO = categoryService.getByName(name);
            return ResponseEntity.ok(categoryDTO);
        }else{
            List<FakeStoreCategoryResponseDTO> result = this.categoryService.getAllCategories();
            return ResponseEntity.ok(result);
        }
    }

    @PostMapping
    public ResponseEntity<CategoryDTO> createCategory(@RequestBody CategoryDTO categoryDTO) throws IOException{

      CategoryDTO categoryResponse = categoryService.createCategory(categoryDTO);

      return ResponseEntity.ok(categoryResponse);
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
