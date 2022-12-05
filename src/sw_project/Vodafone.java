package sw_project;
public class Vodafone implements Companies{
    @Override
    public Service createInternet() {
        return new Internet();
    }

    @Override
    public Service createMobile() {
        return new Mobile();
    }

    @Override
    public Service createDonations() {
        return new Null();
    }

    @Override
    public Service createLandline() {
        return new Null();
    }
}
