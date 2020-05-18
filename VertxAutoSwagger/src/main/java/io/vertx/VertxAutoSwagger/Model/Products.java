package io.vertx.VertxAutoSwagger.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.vertx.VertxAutoSwagger.Model.Product;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Products {
    public Product[] products;
}
