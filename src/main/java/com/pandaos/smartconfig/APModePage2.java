//
//  Copyright (c) 2014 Texas Instruments. All rights reserved.
//

package com.pandaos.smartconfig;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.widget.TextView;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ViewById;

@EFragment(R.layout.ap_mode_page2)
public class APModePage2 extends Fragment {

	@ViewById
	TextView ap_mode_page2_next;
	
	@Click
	void ap_mode_page2_next() {
		ViewPager pager = (ViewPager) getActivity().findViewById(R.id.pager);
		pager.setCurrentItem(2, true);
	}
	
}