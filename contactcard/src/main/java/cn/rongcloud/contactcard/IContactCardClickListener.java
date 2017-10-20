package cn.rongcloud.contactcard;

import android.view.View;

import cn.rongcloud.contactcard.message.ContactMessage;
import io.rong.imkit.model.UIMessage;


public interface IContactCardClickListener {
    void onContactCardClick(View view, ContactMessage content);
}
