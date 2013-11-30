package tk.jakehopkins.silenthub;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
	
	public void onEnable(){
		
	}
	
	public void onDisable(){
		
	}
	
	public boolean onCommand(CommandSender sender, Command cmd,
			String commandLabel, String[] args) {
		Player player = (Player) sender;
		
		
		if(commandLabel.equalsIgnoreCase("silenthub")){
			if(player.hasPermission("silenthub.Enable")){
				for(int p = 0; p < Bukkit.getOnlinePlayers().length; p++){
					player.hidePlayer(Bukkit.getOnlinePlayers()[p]);
				}
				player.sendMessage(ChatColor.GOLD+"SilentHub Activated!");
				return true;
			}
		}
		
		
		if(commandLabel.equalsIgnoreCase("normalhub")){
			if(player.hasPermission("silenthub.Disable")){
				for(int p = 0; p < Bukkit.getOnlinePlayers().length; p++){
					player.showPlayer(Bukkit.getOnlinePlayers()[p]);
				}
				player.sendMessage(ChatColor.GOLD+"NormalHub Activated!");
				return true;
			}
		}
		
		
		return false;
		
	}

}
