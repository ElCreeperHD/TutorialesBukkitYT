  /* 
   Copyright 2016 ElCreeperHD
   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at
       http://www.apache.org/licenses/LICENSE-2.0
   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License. */ 


package elcreeperhd.test.ejemplo;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;



public class ClaseEjecutora implements CommandExecutor{
	
	private ClasePrincipal plugin;

	public ClaseEjecutora(ClasePrincipal plugin)
	{
	  this.plugin = plugin;
	}
	
	

	public boolean onCommand(CommandSender sender, Command cmd, String String,
			String[] args) {
		if(cmd.getName().equalsIgnoreCase("test"))	{
			if(sender.hasPermission("ejemplo")){	
			    sender.sendMessage(ChatColor.AQUA + "" + ChatColor.BOLD + "Hola jugador " + sender.getName() + " Has ejecutado el comando de test" );
				 sender.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "Estoy una linea mas abajo" );	
					}else{	
					sender.sendMessage(ChatColor.RED + "No tienes permisos para este comando");	
					}
			
			
		}	
		
		
		
		
		
		return true;
	}
	

		
		
	}
