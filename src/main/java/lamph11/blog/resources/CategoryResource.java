package lamph11.blog.resources;

import lamph11.blog.BaseResponse;
import lamph11.blog.dto.BaseRequest;
import lamph11.blog.dto.category.CategoryADD;
import lamph11.blog.dto.category.CategoryDTO;
import lamph11.blog.service.CategoryService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/category")
public class CategoryResource {

    private final CategoryService categoryService;

    public CategoryResource(CategoryService categoryService) {
        this.categoryService = categoryService;
    }


    @PostMapping
    public BaseResponse<CategoryDTO> create(@RequestBody BaseRequest<CategoryADD> request) {
        CategoryADD requestBody = request.getBody();
        return null;
    }
}
