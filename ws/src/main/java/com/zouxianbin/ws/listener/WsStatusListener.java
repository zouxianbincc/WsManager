package com.zouxianbin.ws.listener;

import okhttp3.Response;
import okio.ByteString;

/**
 * @author rabtman 可用于监听ws连接状态并进一步拓展
 */
public abstract class WsStatusListener {
  /**
   *  当服务器建立好了连接之后，会调用此方法，一般就是在这里做登录/鉴权操作
   */
  public void onOpen(Response response) {
  }
  /**
   *  收到了服务器发送的消息，text就是收到的消息
   */
  public void onMessage(String text) {
  }
  /**
   *  收到了服务器发送的消息，bytes就是收到的消息
   */
  public void onMessage(ByteString bytes) {
  }
  /**
   *  断开重断
   */
  public void onReconnect() {

  }
  /**
   *  正在关闭当前websocket的时候会调用此方法
   */
  public void onClosing(int code, String reason) {
  }

  /**
   * 关闭完成后会调用此方法，一般是主动关闭后会调用
   */
  public void onClosed(int code, String reason) {
  }
  /**
   *  连接报错的时候会调用，如果需要重连的话一般就是在这里进行重连逻辑
   *  出错原因有很多可能，比如本地网络因素，服务器报错之类，都会走这里
   */
  public void onFailure(Throwable t, Response response) {
  }
}
