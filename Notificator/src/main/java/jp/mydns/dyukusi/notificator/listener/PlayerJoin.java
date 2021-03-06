package jp.mydns.dyukusi.notificator.listener;

import jp.mydns.dyukusi.notificator.Notificator;
import jp.mydns.dyukusi.notificator.task.Notification;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoin implements Listener {

	Notificator plugin;

	public PlayerJoin(Notificator notificator) {
		this.plugin = notificator;
	}

	@EventHandler
	void PlayerJoinEvent(PlayerJoinEvent event) {
		new Notification(plugin, true, false, event.getPlayer(), plugin.get_server_news(),plugin.get_player_news_display_limit()).runTask(plugin);
		new Notification(plugin, false, false, event.getPlayer(), plugin.get_player_news(),plugin.get_player_news_display_limit()).runTask(plugin);
	}
}
