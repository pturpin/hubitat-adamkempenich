/**
* Lightify Bridge - Local Control (Child) (0.1) 
*
*  Author: 
*    Adam Kempenich
*
*  Documentation:  [Does not exist, yet]

*  Changelog:
*    0.10 (Jan 27, 2020)
*        - Create parent app
*        - send a command to the bridge
*        - create structure for parent/children
*        - send command to individual devices
*        - send command to groups
*
*  Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
*  in compliance with the License. You may obtain a copy of the License at:
*
*      http://www.apache.org/licenses/LICENSE-2.0
*
*  Unless required by applicable law or agreed to in writing, software distributed under the License is distributed
*  on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License
*  for the specific language governing permissions and limitations under the License.
*
*/

metadata {
definition (
    name: "Lightify Gateway — Child", 
    namespace: "Lightify", 
    author: "Adam Kempenich",
    importUrl: "https://github.com/adamkempenich/hubitat/raw/master/Drivers/Lightify/lightify%20gateway-child.groovy") {
    
        capability "Actuator"
        capability "Color Control"
		capability "Color Mode"
        capability "Color Temperature"
		capability "Initialize"
        capability "Polling"
        capability "Refresh"
		capability "Sensor"
		capability "Switch"
		capability "Switch Level"
	}
}

def on(){
    parent.on(device.deviceNetworkId)
}
def off(){
    parent.off(device.deviceNetworkId)
}
def setLevel(brightness, duration=0){
     parent.setLevel(device.deviceNetworkId, brightness)   
}
def setColor(parameters){
    parent.setColor(device.deviceNetworkId, parameters)
}
