import java.io.*;
import java.net.*;
class tcpchatserver
{
public static void main(string args[]) throws Exception
{
printWriter toClient;
bufferedReader from User, fromClient;
try
{
ServerSocket Srv = new ServerSocket(5555);
System.out.print("\nServer started\n");
socket clt = Srv.accept();
System.out.println("Client connected");
toClient = new printWriter(new BufferedWriter)new OutputStreamWriter(clt.getOutputStream())),true);
fromClient = new BufferedReader(new InputStreamWriter(clt.getInputStream()));
fromUser = new BufferedReader(new InputStreamReader(system.in));
String cltMsg,srvMsg;
while(true)
{
CltMsg= fromClient.readLine();
if (CltMsg.equals("end"))
break;
else 
{
System.out.println("Message to Client :");
SrvMsg = fromUser.readLine();
toClient.println(SrvMsg);
}
}
System.out.println("\nClient Disconnected");
fromClient.close();
toClient.close();
fromUser.close();
clt.close();
srv close();
}
catch (Exception E)
{
System.out.println(E.getMessage());
}
}
}
