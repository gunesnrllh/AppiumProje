
public enum LocatorP {
        SKIPPUPDATE("//*[@resource-id='com.ozdilek.ozdilekteyim:id/btnRemindLater']"),
        HOMEPAGE_CHECK("//*[@resource-id='com.ozdilek.ozdilekteyim:id/tv_startShoppingStore']"),
        ALISVERISE_BASLA("//*[@resource-id='com.ozdilek.ozdilekteyim:id/tv_startShoppingStore']"),
        SHOPPINGPAGECHECK("//*[@resource-id='com.ozdilek.ozdilekteyim:id/recyclerView']"),
        CATEGORY("//*[@resource-id='com.ozdilek.ozdilekteyim:id/nav_categories']"),
        CATEGORYCHECK("//*[@content-desc='Kategoriler']"),
        WOMANCATEGORYSELECT("//*[@resource-id='com.ozdilek.ozdilekteyim:id/relLayCategoriesItem'][2]"),
        PANTOLONSELECT("//*[@resource-id='com.ozdilek.ozdilekteyim:id/relLayCategoriesItem'][14]"),
        PRODUCTSCHECK("//*[@resource-id='com.ozdilek.ozdilekteyim:id/container']"),
        PRDUCTSLIST("//android.widget.ImageView[@resource-id='com.ozdilek.ozdilekteyim:id/imageView']"),
        PRODUCTCHOOSESIZE("//androidx.recyclerview.widget.RecyclerView//android.widget.RelativeLayout[@index=2]"),//widget id ile xpath
        PRODUCTADDFAVORITES("//*[@resource-id='com.ozdilek.ozdilekteyim:id/relLayFav']"),
        LOGINPAGE("//*[@resource-id='com.ozdilek.ozdilekteyim:id/clContainer']"),
        INSERTEMAIL("//*[@resource-id='com.ozdilek.ozdilekteyim:id/etEposta']"),
        INSERTPASSWORD("//*[@resource-id='com.ozdilek.ozdilekteyim:id/etPassword'"),
        ADDCART("//*[@resource-id='com.ozdilek.ozdilekteyim:id/relLayAddCartBtn']"),;

        private String locators;
        LocatorP(String select) {
                this.locators = select;
        }
        public String getLocator() {
            return locators;
        }
    }