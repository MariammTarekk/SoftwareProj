
public class NGOS implements Companies{
    @Override
    public Service createInternet() {
        return new Null();
    }

    @Override
    public Service createMobile() {
        return new Null();
    }

    @Override
    public Service createDonations() {
        return new Donations();
    }

    @Override
    public Service createLandline() {
        return new Null();
    }
}
