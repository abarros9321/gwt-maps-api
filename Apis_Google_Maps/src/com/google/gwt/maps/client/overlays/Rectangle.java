package com.google.gwt.maps.client.overlays;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.maps.client.MapImpl;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.base.LatLngBounds;
import com.google.gwt.maps.client.events.MapEventType;
import com.google.gwt.maps.client.events.MapHandlerRegistration;
import com.google.gwt.maps.client.events.bounds.BoundsChangeEventFormatter;
import com.google.gwt.maps.client.events.bounds.BoundsChangeMapHandler;
import com.google.gwt.maps.client.events.click.ClickEventFormatter;
import com.google.gwt.maps.client.events.click.ClickMapHandler;
import com.google.gwt.maps.client.events.dblclick.DblClickEventFormatter;
import com.google.gwt.maps.client.events.dblclick.DblClickMapHandler;
import com.google.gwt.maps.client.events.mousedown.MouseDownEventFormatter;
import com.google.gwt.maps.client.events.mousedown.MouseDownMapHandler;
import com.google.gwt.maps.client.events.mousemove.MouseMoveEventFormatter;
import com.google.gwt.maps.client.events.mousemove.MouseMoveMapHandler;
import com.google.gwt.maps.client.events.mouseout.MouseOutEventFormatter;
import com.google.gwt.maps.client.events.mouseout.MouseOutMapHandler;
import com.google.gwt.maps.client.events.mouseover.MouseOverEventFormatter;
import com.google.gwt.maps.client.events.mouseover.MouseOverMapHandler;
import com.google.gwt.maps.client.events.mouseup.MouseUpEventFormatter;
import com.google.gwt.maps.client.events.mouseup.MouseUpMapHandler;
import com.google.gwt.maps.client.events.rightclick.RightClickEventFormatter;
import com.google.gwt.maps.client.events.rightclick.RightClickMapHandler;
import com.google.gwt.maps.client.mvc.MVCObject;

/**
 * A rectangle overlay. This class extends MVCObject.
 * {@link http://code.google.com/apis/maps/documentation/javascript/reference.html#Rectangle}
 */
public class Rectangle extends MVCObject<Rectangle> {

  /**
   * use newInstance();
   */
  protected Rectangle() {}

  /**
   * Create a rectangle using the passed RectangleOptions, which specify the bounds and style.
   * @param options
   * @return
   */
  public final static Rectangle newInstance(RectangleOptions options) {
    return createJso(options).cast();
  }

  private final static native JavaScriptObject createJso(RectangleOptions options) /*-{
    return new $wnd.google.maps.Rectangle(options);
  }-*/;

  /**
   * Returns the bounds of this rectangle.
   * @return
   */
  public final native LatLngBounds getBounds() /*-{
    return this.getBounds();
  }-*/;

  /**
   * Returns whether this rectangle can be edited by the user.
   * @return
   */
  public final native boolean getEditable() /*-{
    return this.getEditable();
  }-*/;

  /**
   * Renders the rectangle on the specified map. If map is set to null, the rectangle will be removed.
   * @param mapWidget
   */
  public final void setMap(MapWidget mapWidget) {
    setMapImpl(mapWidget.getJso());
  }

  private final native void setMapImpl(MapImpl map) /*-{
    this.map = map;
  }-*/;

  /**
   * Returns the map on which this rectangle is displayed.
   * @return
   */
  public final MapWidget getMap() {
    return MapWidget.newInstance(getMapImpl());
  }

  private final native MapImpl getMapImpl() /*-{
    return this.map;
  }-*/;

  /**
   * If set to true, the user can edit this rectangle by dragging the control points shown at the corners and on each edge.
   * @param editable
   */
  public final native void setEditable(boolean editable) /*-{
    this.setEditable(editable);
  }-*/;

  /**
   * sets the Rectangle options
   * @param options
   */
  public final native void setOptions(RectangleOptions options) /*-{
    this.options = options;
  }-*/;
  
  public final HandlerRegistration addBoundsChangeHandler(BoundsChangeMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.BOUNDS_CHANGED, handler, new BoundsChangeEventFormatter());
  }

  /**
   * This event is fired when the DOM click event is fired on the Rectangle.
   * @param handler
   * @return
   */
  public final HandlerRegistration addClickHandler(ClickMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.CLICK, handler, new ClickEventFormatter());
  }
  
  /**
   * This event is fired when the DOM dblclick event is fired on the Rectangle.
   * @param handler
   * @return
   */
  public final HandlerRegistration addDblClickHandler(DblClickMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.DBLCLICK, handler, new DblClickEventFormatter());
  }
  
  /**
   * This event is fired when the DOM mousedown event is fired on the Rectangle.
   * @param handler
   * @return
   */
  public final HandlerRegistration addMouseDownHandler(MouseDownMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.MOUSEDOWN, handler, new MouseDownEventFormatter());
  }
  
  /**
   * This event is fired when the DOM mousemove event is fired on the Rectangle.
   * @param handler
   * @return
   */
  public final HandlerRegistration addMouseMoveHandler(MouseMoveMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.MOUSEMOVE, handler, new MouseMoveEventFormatter());
  }
  
  /**
   * This event is fired on Rectangle mouseout.
   * @param handler
   * @return
   */
  public final HandlerRegistration addMouseOutMoveHandler(MouseOutMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.MOUSEOUT, handler, new MouseOutEventFormatter());
  }
  
  /**
   * This event is fired on Rectangle mouseover.
   * @param handler
   * @return
   */
  public final HandlerRegistration addMouseOverHandler(MouseOverMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.MOUSEOVER, handler, new MouseOverEventFormatter());
  }
  
  /**
   * This event is fired when the DOM mouseup event is fired on the Rectangle.
   * @param handler
   * @return
   */
  public final HandlerRegistration addMouseUpHandler(MouseUpMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.MOUSEUP, handler, new MouseUpEventFormatter());
  }
  
  /**
   * This event is fired when the Rectangle is right-clicked on.
   * @param handler
   * @return
   */
  public final HandlerRegistration addRightClickHandler(RightClickMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.RIGHTCLICK, handler, new RightClickEventFormatter());
  }
  
} 
