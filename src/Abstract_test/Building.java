package Abstract_test;

public class Building implements Mappable{
String name;
enum Usage {Entertainment, Government}
    public Building(String name) {
        this.name = name;
    }

    @Override
    public String returnLabel() {
return Usage.Government.toString();
    }

    @Override
    public String returnGeometryType() {
        return  PointMarkers.DOT.toString();
    }

    @Override
    public Geometry returnIconType() {
return Geometry.POINT;
    }

    @Override
    public String toJSON() {
        return Mappable.super.toJSON()+ """
                "name": %s""".formatted(name);
    }
}
