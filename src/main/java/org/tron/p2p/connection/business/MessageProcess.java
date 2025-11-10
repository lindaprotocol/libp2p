package org.linda.p2p.connection.business;

import org.linda.p2p.connection.Channel;
import org.linda.p2p.connection.message.Message;

public interface MessageProcess {
  void processMessage(Channel channel, Message message);
}
