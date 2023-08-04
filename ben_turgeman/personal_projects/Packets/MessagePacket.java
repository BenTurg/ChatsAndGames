package ben_turgeman.personal_projects.Packets;

import com.google.gson.Gson;

public class MessagePacket
{
    private String _from;
    private String _recipient;
    private String _message;

    public MessagePacket(String from, String recipient, String message)
    {
        this._from = from;
        this._recipient = recipient;
        this._message = message;
    }

    public String get_from() {
        return _from;
    }

    public String get_recipient() {
        return _recipient;
    }

    public String get_message() {
        return _message;
    }

    public String toJson()
    {
        Gson g = new Gson();
        return g.toJson(this);
    }

    public static MessagePacket fromJson(String data)
    {
        /*
        'data' represents the JSON string that needs to be converted into a `MessagePacket` object.
        The `MessagePacket.class` is used to specify the type of object that the JSON string should be converted into.
        It tells the `Gson` object to create an instance of the `MessagePacket` class from the provided JSON string.
        * */
        Gson g = new Gson();
        return g.fromJson(data, MessagePacket.class);
    }



}
