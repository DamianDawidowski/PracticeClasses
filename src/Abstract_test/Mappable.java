package Abstract_test;




public interface Mappable {
    enum Geometry {POINT,LINE};
    enum PointMarkers {DOT,DIAMOND};
    enum Color {POINT,LINE};
    String JSON_PROPERTY = """
            "properties":{%s}""";

    default String toJSON() {
      return """
            
              "type": %s", "label": "%s", "marker": "%s" """
                .formatted(returnLabel(), returnGeometryType(), returnIconType());

    }


    String returnLabel();
    String returnGeometryType();
    Geometry returnIconType();
static void mapIt (Mappable mappable) {
System.out.printf( JSON_PROPERTY.formatted(mappable.toJSON()));

 }
}
