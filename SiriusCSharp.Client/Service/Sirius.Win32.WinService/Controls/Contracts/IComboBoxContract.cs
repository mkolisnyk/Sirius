using System;
using System.ServiceModel;
namespace Sirius.Win32.Svc.Controls
{
    [ServiceContract(Namespace = "http://combobox.controls.win32lib.server.sirius.org/")]
    public interface IComboBoxContract
    {
        [OperationContract]
        string[] GetItemNames([param: MessageParameter(Name = "hwnd")]int hwnd);
        [OperationContract]
        int GetItemsCount([param: MessageParameter(Name = "hwnd")]int hwnd);
        [OperationContract]
        int GetSelectedIndex([param: MessageParameter(Name = "hwnd")]int hwnd);
        [OperationContract]
        string GetSelectedItem([param: MessageParameter(Name = "hwnd")]int hwnd);
        [OperationContract]
        string GetText([param: MessageParameter(Name = "hwnd")]int hwnd);
        [OperationContract]
        void SelectByIndex([param: MessageParameter(Name = "hwnd")]int hwnd, [param: MessageParameter(Name = "index")]int index);
        [OperationContract]
        void SelectByName([param: MessageParameter(Name = "hwnd")]int hwnd, [param: MessageParameter(Name = "item")]string item);
        [OperationContract]
        void SetText([param: MessageParameter(Name = "hwnd")]int hwnd, [param: MessageParameter(Name = "text")]string text);
    }
}
