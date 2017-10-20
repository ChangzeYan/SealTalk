package cn.rongcloud.contactcard;

public class ContactCardContext {
    private IContactCardInfoProvider iContactCardInfoProvider;
    private static volatile ContactCardContext contactCardContext = null;

    private ContactCardContext() {

    }

    public static ContactCardContext getInstance() {
        if (contactCardContext == null) {
            synchronized (ContactCardContext.class) {
                if (contactCardContext == null) {
                    contactCardContext = new ContactCardContext();
                }
            }
        }
        return contactCardContext;
    }

    public void setContactCardInfoProvider(IContactCardInfoProvider iContactCardInfoProvider) {
        this.iContactCardInfoProvider = iContactCardInfoProvider;
    }

    public IContactCardInfoProvider getContactCardInfoProvider() {
        return iContactCardInfoProvider;
    }

}
