public class UserManager {

    public void addUser(User user){
        System.out.println("Sisteme kaydoldu : " + user.getUserId());
    }

    public void deleteUser(User user){
        System.out.println("Sistemden silindi : " + user.getUserId());
    }

    public void updateUser(User user){
        System.out.println("Güncellendi : " + user.getUserId());
    }

    public void login(User user){
        System.out.println("Sisteme " + user.getUserId() + " başarılı giriş yapmıştır.");
    }

    public void logout(){
        System.out.println("Sistemden başarılı çıkış yapılmıştır.");
    }


}
