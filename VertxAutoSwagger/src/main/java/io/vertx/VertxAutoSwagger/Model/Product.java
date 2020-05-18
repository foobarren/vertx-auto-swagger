package io.vertx.VertxAutoSwagger.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import generator.Required;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Product {

    @Required
    public String _id;
    public String title;
    public String image_url;
    public String from_date;
    public String to_date;
    public String price;
    public Boolean enabled;

}
