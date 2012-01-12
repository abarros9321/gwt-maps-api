package com.google.gwt.maps.client;

import junit.framework.Test;
import junit.framework.TestSuite;

import com.google.gwt.junit.tools.GWTTestSuite;
import com.google.gwt.maps.client.adsense.AdFormatTest;
import com.google.gwt.maps.client.adsense.AdUnitImplTest;
import com.google.gwt.maps.client.adsense.AdUnitOptionsTest;
import com.google.gwt.maps.client.adsense.AdUnitWidgetTest;
import com.google.gwt.maps.client.base.LatLngBoundsTest;
import com.google.gwt.maps.client.base.LatLngTest;
import com.google.gwt.maps.client.base.PointTest;
import com.google.gwt.maps.client.base.SizeTest;
import com.google.gwt.maps.client.controls.ControlPositionTest;
import com.google.gwt.maps.client.controls.MapTypeControlOptionsTest;
import com.google.gwt.maps.client.controls.OverviewMapControlOptionsTest;
import com.google.gwt.maps.client.controls.PanControlOptionsTest;
import com.google.gwt.maps.client.controls.RotateControlOptionsTest;
import com.google.gwt.maps.client.controls.ScaleControlOptionsTest;
import com.google.gwt.maps.client.controls.ScaleControlStyleTest;
import com.google.gwt.maps.client.controls.ZoomControlOptionsTest;
import com.google.gwt.maps.client.controls.ZoomControlStyleTest;
import com.google.gwt.maps.client.drawing.DrawingControlOptionsTest;
import com.google.gwt.maps.client.drawing.DrawingManagerOptionsTest;
import com.google.gwt.maps.client.drawing.OverlayTypeTest;
import com.google.gwt.maps.client.events.MapEventTypeTest;
import com.google.gwt.maps.client.events.MapHandlerRegistrationTest;
import com.google.gwt.maps.client.geometrylib.EncodingUtilsTest;
import com.google.gwt.maps.client.geometrylib.SphericalUtilsTest;
import com.google.gwt.maps.client.layers.BicyclingLayerTest;
import com.google.gwt.maps.client.layers.FusionTableLayerTest;
import com.google.gwt.maps.client.layers.FusionTablesCellTest;
import com.google.gwt.maps.client.layers.FusionTablesHeatmapTest;
import com.google.gwt.maps.client.layers.FusionTablesLayerOptionsTest;
import com.google.gwt.maps.client.layers.FusionTablesMarkerOptionsTest;
import com.google.gwt.maps.client.layers.FusionTablesPolygonOptionsTest;
import com.google.gwt.maps.client.layers.FusionTablesPolylineOptionsTest;
import com.google.gwt.maps.client.layers.FusionTablesStyleTest;
import com.google.gwt.maps.client.layers.KmlFeatureDataTest;
import com.google.gwt.maps.client.layers.KmlLayerMetadataTest;
import com.google.gwt.maps.client.layers.KmlLayerOptionsTest;
import com.google.gwt.maps.client.layers.KmlLayerTest;
import com.google.gwt.maps.client.layers.TrafficLayerTest;
import com.google.gwt.maps.client.main.LoadApiTest;
import com.google.gwt.maps.client.main.MapOptionsTest;
import com.google.gwt.maps.client.main.MapTypeIdTest;
import com.google.gwt.maps.client.main.MapWidgetTest;
import com.google.gwt.maps.client.maptype.ImageMapTypeTest;
import com.google.gwt.maps.client.maptype.MapTypeStyeElementTypeTest;
import com.google.gwt.maps.client.maptype.MapTypeStyleFeatureTypeTest;
import com.google.gwt.maps.client.maptype.MapTypeStyleTest;
import com.google.gwt.maps.client.maptype.MapTypeStylerTest;
import com.google.gwt.maps.client.maptype.ProjectionTest;
import com.google.gwt.maps.client.maptype.StyledMapTypeTest;
import com.google.gwt.maps.client.mvc.MVCArrayTest;
import com.google.gwt.maps.client.mvc.MVCObjectTest;
import com.google.gwt.maps.client.overlays.AnimationTest;
import com.google.gwt.maps.client.overlays.CircleOptionsTest;
import com.google.gwt.maps.client.overlays.CircleTest;
import com.google.gwt.maps.client.overlays.GroundOverlayOptionsTest;
import com.google.gwt.maps.client.overlays.GroundOverlayTest;
import com.google.gwt.maps.client.overlays.InfoWindowOptionsTest;
import com.google.gwt.maps.client.overlays.InfoWindowTest;
import com.google.gwt.maps.client.overlays.MapCanvasProjectionTest;
import com.google.gwt.maps.client.overlays.MapPanesTest;
import com.google.gwt.maps.client.overlays.MarkerImageTest;
import com.google.gwt.maps.client.overlays.MarkerImplTest;
import com.google.gwt.maps.client.overlays.MarkerOptionsTest;
import com.google.gwt.maps.client.overlays.MarkerShapeTest;
import com.google.gwt.maps.client.overlays.MarkerShapeTypeTest;
import com.google.gwt.maps.client.overlays.MarkerTest;
import com.google.gwt.maps.client.overlays.OverlayViewTest;
import com.google.gwt.maps.client.overlays.PolygonOptionsTest;
import com.google.gwt.maps.client.overlays.PolygonTest;
import com.google.gwt.maps.client.overlays.PolylineOptionsTest;
import com.google.gwt.maps.client.overlays.PolylineTest;
import com.google.gwt.maps.client.overlays.RectangleOptionsTest;
import com.google.gwt.maps.client.overlays.RectangleTest;
import com.google.gwt.maps.client.panoramio.PanoramioFeatureTest;
import com.google.gwt.maps.client.panoramio.PanoramioLayerTest;
import com.google.gwt.maps.client.panoramio.PanoramioOptionsTest;
import com.google.gwt.maps.client.placelib.AutocompleteOptionsTest;
import com.google.gwt.maps.client.placelib.AutocompleteTest;
import com.google.gwt.maps.client.placelib.AutocompleteTypeTest;
import com.google.gwt.maps.client.placelib.PlaceDetailsRequestTest;
import com.google.gwt.maps.client.placelib.PlaceGeomtryTest;
import com.google.gwt.maps.client.placelib.PlaceResultTest;
import com.google.gwt.maps.client.placelib.PlaceServiceStatusTest;
import com.google.gwt.maps.client.placelib.PlacesServiceTest;
import com.google.gwt.maps.client.service.GeocoderAddressComponentTest;
import com.google.gwt.maps.client.service.GeocoderGeometryTest;
import com.google.gwt.maps.client.service.GeocoderLocationTypeTest;
import com.google.gwt.maps.client.service.GeocoderRequestTest;
import com.google.gwt.maps.client.service.GeocoderResultTest;
import com.google.gwt.maps.client.service.GeocoderStatusTest;
import com.google.gwt.maps.client.service.GeocoderTest;
import com.google.gwt.maps.client.streetview.StreetViewAddressControlOptionsTest;
import com.google.gwt.maps.client.streetview.StreetViewControlOptionsTest;
import com.google.gwt.maps.client.streetview.StreetViewLinkTest;
import com.google.gwt.maps.client.streetview.StreetViewLocationTest;
import com.google.gwt.maps.client.streetview.StreetViewPanaoramaOptionsTest;
import com.google.gwt.maps.client.streetview.StreetViewPanoramaDataTest;
import com.google.gwt.maps.client.streetview.StreetViewPanoramaImplTest;
import com.google.gwt.maps.client.streetview.StreetViewPanoramaWidgetTest;
import com.google.gwt.maps.client.streetview.StreetViewPovTest;
import com.google.gwt.maps.client.streetview.StreetViewServiceTest;
import com.google.gwt.maps.client.streetview.StreetViewTileDataTest;

/**
 * NOTES:
 * - I haven't flushed ever error out 
 * - I haven't tested every feature
 * - I've noticed a canvas error pops up when using some, but doesn't affect the assertions, 
 *      also, this doesn't show up when trying to divide and conquer. I've chosen to move on and catch it later. 
 */
public class MapsTestSuite extends GWTTestSuite {

  public static Test suite() {
    TestSuite suite = new TestSuite("GWT_Google_Maps_V3_Testing");
    
    /**
     * this has to go first, with all libs loading
     */
    suite.addTestSuite(LoadApiTest.class);
    
    
    suite.addTestSuite(ControlPositionTest.class);
    suite.addTestSuite(LatLngBoundsTest.class);
    suite.addTestSuite(LatLngTest.class);
    suite.addTestSuite(MapHandlerRegistrationTest.class);
    suite.addTestSuite(MapEventTypeTest.class);
    suite.addTestSuite(MapOptionsTest.class);
    suite.addTestSuite(MapTypeControlOptionsTest.class);
    suite.addTestSuite(MapTypeIdTest.class);
    suite.addTestSuite(MapTypeStyeElementTypeTest.class);
    suite.addTestSuite(MapTypeStyleFeatureTypeTest.class);
    suite.addTestSuite(MapTypeStyleTest.class);    
    suite.addTestSuite(MapTypeStylerTest.class);
    suite.addTestSuite(MapWidgetTest.class);
    suite.addTestSuite(MarkerImageTest.class);
    suite.addTestSuite(MVCArrayTest.class);
    suite.addTestSuite(MVCObjectTest.class);
    suite.addTestSuite(OverviewMapControlOptionsTest.class);
    suite.addTestSuite(PanControlOptionsTest.class);
    suite.addTestSuite(PointTest.class);
    suite.addTestSuite(ProjectionTest.class);
    suite.addTestSuite(RotateControlOptionsTest.class);
    suite.addTestSuite(ScaleControlOptionsTest.class);
    suite.addTestSuite(SizeTest.class);
    suite.addTestSuite(StreetViewAddressControlOptionsTest.class);
    suite.addTestSuite(StreetViewControlOptionsTest.class);
    suite.addTestSuite(StreetViewPanoramaDataTest.class);
    suite.addTestSuite(StreetViewPanaoramaOptionsTest.class); 
    suite.addTestSuite(StreetViewLinkTest.class);
    suite.addTestSuite(StreetViewLocationTest.class);
    suite.addTestSuite(StreetViewPanoramaWidgetTest.class); 
    suite.addTestSuite(StreetViewPovTest.class);
    suite.addTestSuite(StreetViewTileDataTest.class);
    suite.addTestSuite(ScaleControlStyleTest.class); 
    suite.addTestSuite(ZoomControlOptionsTest.class);
    suite.addTestSuite(ZoomControlStyleTest.class); 
    suite.addTestSuite(MarkerShapeTest.class);
    suite.addTestSuite(MarkerShapeTypeTest.class);  
    suite.addTestSuite(AnimationTest.class);  
    suite.addTestSuite(MarkerOptionsTest.class);
    suite.addTestSuite(MarkerTest.class);
    suite.addTestSuite(MarkerImplTest.class);
    suite.addTestSuite(InfoWindowOptionsTest.class);
    suite.addTestSuite(InfoWindowTest.class);
    suite.addTestSuite(InfoWindowTest.class);
    suite.addTestSuite(PolylineOptionsTest.class);
    suite.addTestSuite(PolylineTest.class);
    suite.addTestSuite(PolygonOptionsTest.class);
    suite.addTestSuite(PolygonTest.class);
    suite.addTestSuite(RectangleOptionsTest.class);
    suite.addTestSuite(RectangleTest.class);
    suite.addTestSuite(CircleOptionsTest.class);
    suite.addTestSuite(CircleTest.class);
    suite.addTestSuite(GroundOverlayOptionsTest.class);
    suite.addTestSuite(GroundOverlayTest.class);
    suite.addTestSuite(MapPanesTest.class);
    suite.addTestSuite(OverlayViewTest.class);
    suite.addTestSuite(MapCanvasProjectionTest.class);
    suite.addTestSuite(ImageMapTypeTest.class);
    suite.addTestSuite(StyledMapTypeTest.class);
    suite.addTestSuite(BicyclingLayerTest.class);
    suite.addTestSuite(FusionTableLayerTest.class);
    suite.addTestSuite(FusionTablesLayerOptionsTest.class);
    suite.addTestSuite(FusionTableLayerTest.class);
    suite.addTestSuite(FusionTablesHeatmapTest.class);
    suite.addTestSuite(FusionTablesStyleTest.class);
    suite.addTestSuite(FusionTablesMarkerOptionsTest.class);
    suite.addTestSuite(FusionTablesPolygonOptionsTest.class);
    suite.addTestSuite(FusionTablesPolylineOptionsTest.class);
    suite.addTestSuite(FusionTablesCellTest.class);
    suite.addTestSuite(KmlLayerTest.class);
    suite.addTestSuite(KmlLayerOptionsTest.class);    
    suite.addTestSuite(KmlLayerTest.class);
    suite.addTestSuite(KmlLayerMetadataTest.class);
    suite.addTestSuite(KmlFeatureDataTest.class);
    suite.addTestSuite(TrafficLayerTest.class);
    suite.addTestSuite(EncodingUtilsTest.class);
    suite.addTestSuite(SphericalUtilsTest.class);
    suite.addTestSuite(AdUnitOptionsTest.class);
    suite.addTestSuite(AdFormatTest.class);
    suite.addTestSuite(AdUnitImplTest.class);
    suite.addTestSuite(AdUnitWidgetTest.class);
    suite.addTestSuite(PanoramioOptionsTest.class);
    suite.addTestSuite(PanoramioFeatureTest.class);
    suite.addTestSuite(PanoramioLayerTest.class);
    suite.addTestSuite(OverlayTypeTest.class);
    suite.addTestSuite(DrawingControlOptionsTest.class);
    suite.addTestSuite(DrawingManagerOptionsTest.class);
    suite.addTestSuite(AutocompleteTypeTest.class);
    suite.addTestSuite(AutocompleteOptionsTest.class);
    suite.addTestSuite(AutocompleteTest.class);
    suite.addTestSuite(GeocoderAddressComponentTest.class);
    suite.addTestSuite(PlaceGeomtryTest.class);
    suite.addTestSuite(PlaceDetailsRequestTest.class);
    suite.addTestSuite(PlaceResultTest.class);
    suite.addTestSuite(PlaceServiceStatusTest.class);
    suite.addTestSuite(PlacesServiceTest.class);
    suite.addTestSuite(StreetViewPanoramaImplTest.class);
    suite.addTestSuite(StreetViewServiceTest.class);
    suite.addTestSuite(GeocoderStatusTest.class);
    suite.addTestSuite(GeocoderRequestTest.class);
    suite.addTestSuite(GeocoderResultTest.class);
    suite.addTestSuite(GeocoderLocationTypeTest.class);
    suite.addTestSuite(GeocoderGeometryTest.class);
    suite.addTestSuite(GeocoderTest.class);
    
    return suite;
  }
  
}
