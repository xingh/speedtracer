package com.google.speedtracer.client.model;

import com.google.gwt.coreext.client.DataBag;
import com.google.speedtracer.client.model.NetworkResource.HeaderMap;

/**
 * Overlay type for inspector resource messages that are sent when we receive a
 * response for a resource request.
 */
public class InspectorDidReceiveResponse extends InspectorResourceMessage {
  public static final class Data extends InspectorResourceMessage.Data {
    protected Data() {
    }

    public Response getResponse() {
      return getJSObjectProperty("response");
    }
  }

  public static class Response extends DataBag {
    protected Response() {
    }

    public final int getConnectionID() {
      return getIntProperty("connectionID");
    }

    public final boolean getConnectionReused() {
      return getBooleanProperty("connectionReused");
    }

    public final DetailedResponseTiming getDetailedTiming() {
      return getJSObjectProperty("timing").<DetailedResponseTiming>cast();
    }

    public final HeaderMap getHeaders() {
      return getJSObjectProperty("httpHeaderFields").<HeaderMap>cast();
    }

    public final int getHttpStatusCode() {
      return getIntProperty("httpStatusCode");
    }

    public final String getHttpStatusText() {
      return getStringProperty("httpStatusText");
    }

    public final String getUrl() {
      return getStringProperty("url");
    }

    public final boolean wasCached() {
      return getBooleanProperty("wasCached");
    }
  }

  protected InspectorDidReceiveResponse() {
  }
}