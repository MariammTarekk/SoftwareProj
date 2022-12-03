import java.net.PortUnreachableException;

public interface Companies {
    public Service createInternet();
    public Service createMobile();
    public Service createDonations();
    public Service createLandline();
}
