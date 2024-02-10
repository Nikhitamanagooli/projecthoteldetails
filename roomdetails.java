public class roomdetails
{
    void floor_no(int room_no)
    {
        if(room_no>1 && room_no<=20)
        {
            System.out.println("Ground Floor");
        }
        else if(room_no>21 && room_no<=30)
        {
            System.out.println("First Floor");
        }
        else if(room_no>31 && room_no<=40)
        {
            System.out.println("Second Floor");
        }
    }
}