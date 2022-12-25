package image;


import lombok.Getter;
@Getter
public class ProxyImage implements MyImage{
    private String FileName;
    @Getter
    private RealImage image;



    public ProxyImage(String filename) {
        this.FileName = filename;
    }

    @Override
    public void display() {
        if (image != null){
            image = new RealImage(FileName);
        }
    }
}
