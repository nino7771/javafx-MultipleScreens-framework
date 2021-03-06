package com.zella.mdiframework;

/**
 * Implement this interface if you need to dispose specific resources in
 * controller or internal window
 * 
 * @author zella
 *
 */
public interface IDestroyable {
	/**
	 * Release resources this
	 */
	public void onDestroy();
}
