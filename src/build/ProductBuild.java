public class ProductBuild implements Builder {

    private Product product;

    public ProductBuild(){
        this.product = new Product();
    }

    @Override
    public void setColor() {
        product.setColor("color: 红色");
    }

    @Override
    public void setSize() {
        product.setSize("size: 100cm");
    }

    @Override
    public void setWeight() {
        product.setWeight("weight: 87kg");
    }

    @Override
    public Product buildProduct() {
        return product;
    }
}
