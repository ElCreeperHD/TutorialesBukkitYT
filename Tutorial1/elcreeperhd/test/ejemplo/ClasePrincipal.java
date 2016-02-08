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

import java.util.logging.Level;
import java.util.logging.Logger;




import org.bukkit.plugin.java.JavaPlugin;



public class ClasePrincipal extends JavaPlugin{
	
	public static Logger log = Logger.getLogger("Minecraft");
	
	public void onEnable(){	
	//cuando se active...	
	log.log(Level.INFO, "Plugin de ejemplo se ha activado.");
	ClaseEjecutora exe = new ClaseEjecutora(this);
    getCommand("test").setExecutor(exe);
		
	}
	
	public void onDisable(){
		
		log.log(Level.INFO, "Plugin de ejemplo se ha desactivado.");		
		
	}
	
	
	
	
	
	
	

}
