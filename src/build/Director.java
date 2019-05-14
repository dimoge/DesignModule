public class Director {

    private Builder builder = new ProductBuild();

    public Product buildMyProduct(ProductBuild productBuild){
        builder.setColor();
        builder.setSize();
        builder.setWeight();
        return builder.buildProduct();
    }
}
