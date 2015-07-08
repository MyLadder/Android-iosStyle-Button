# Android-iosStyle-Button

A simple ios-style Button

![crosswall](https://raw.githubusercontent.com/crosswall/Android-iosStyle-Button/master/screenshots/07E93D39-356C-494E-85B5-133DA3413968.png? =360x640)

#Usage

use it in you xml !!!

```bash
<me.crosswall.library.IOSButton
        android:id="@+id/iosbutton_default"
        android:layout_width="140dp"
        android:layout_height="40dp"
        android:text="Default style"
        app:btn_strokeWidth="1dp"
        app:btn_strokeColor="@color/green"
        app:btn_unpressColor="@color/white"
        app:btn_pressColor="@color/green"
        app:btn_text_unpressColor="@color/green"
        app:btn_text_pressColor="@color/white"/>
```
or

```bash
    <style name="CustomButtonStyle" parent="Crosswall.IOSButton">
        <item name="btn_strokeWidth">1dp</item>
        <item name="btn_strokeColor">@color/yellow</item>
        <item name="btn_blur">false</item>
        <item name="btn_cornerRadius">4dp</item>
        <item name="btn_unpressColor">@color/gray</item>
        <item name="btn_pressColor">@color/red</item>
        <item name="btn_text_unpressColor">@color/white</item>
        <item name="btn_text_pressColor">@color/white</item>
    </style>
```


