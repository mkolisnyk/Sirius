/**
 * 
 */
package org.sirius.server.win32.classes.controls;

/**
 * @author Myk Kolisnyk
 *
 */
public class Button {

	/**
	 * 
	 */
	public Button() {
		// TODO Auto-generated constructor stub
	}

	/*
	 #define Button_Enable(hwndCtl,fEnable) EnableWindow((hwndCtl),(fEnable))
#define Button_GetCheck(hwndCtl) ((int)(DWORD)SNDMSG((hwndCtl),BM_GETCHECK,0,0))
#define Button_GetState(hwndCtl) ((int)(DWORD)SNDMSG((hwndCtl),BM_GETSTATE,0,0))
#define Button_GetText(hwndCtl,lpch,cchMax) GetWindowText((hwndCtl),(lpch),(cchMax))
#define Button_GetTextLength(hwndCtl) GetWindowTextLength(hwndCtl)
#define Button_SetCheck(hwndCtl,check) ((void)SNDMSG((hwndCtl),BM_SETCHECK,(WPARAM)(int)(check),0))
#define Button_SetState(hwndCtl,state) ((UINT)(DWORD)SNDMSG((hwndCtl),BM_SETSTATE,(WPARAM)(int)(state),0))
#define Button_SetStyle(hwndCtl,style,fRedraw) ((void)SNDMSG((hwndCtl),BM_SETSTYLE,(WPARAM)LOWORD(style),MAKELPARAM(((fRedraw) ? TRUE : FALSE),0)))
#define Button_SetText(hwndCtl,lpsz) SetWindowText((hwndCtl),(lpsz))

	 */
}
