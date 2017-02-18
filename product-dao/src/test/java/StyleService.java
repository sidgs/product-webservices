import com.sidgs.product.model.Product;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;


@PropertySource("classpath:member-jdbc.properties")

public class StyleService{


    @Autowired
    private ProductService productService;

    @Autowired
    private StyleService styleService;


    @Test
    public void add(){

        StyleService styleService = new StyleService();

    }
 }
