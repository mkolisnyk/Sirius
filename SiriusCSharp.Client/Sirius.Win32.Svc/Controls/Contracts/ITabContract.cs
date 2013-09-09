using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.ServiceModel;

namespace Sirius.Win32.Svc.Controls
{
    [ServiceContract(Namespace = "Sirius.Win32.Svc.Controls", Name="Tab")]
    public interface ITabContract
    {
        [OperationContract(Name = "GetItemsCount")]
        [return: MessageParameter(Name="ItemCount")]
        int GetItemsCount([param: MessageParameter(Name = "hwnd")]int hwnd);

        [OperationContract(Name = "GetSelectedIndex")]
        [return: MessageParameter(Name = "Index")]
        int GetSelectedIndex([param: MessageParameter(Name = "hwnd")]int hwnd);

        [OperationContract(Name = "GetSelectedItem")]
        [return: MessageParameter(Name = "SelectedItemName")]
        String GetSelectedItem([param: MessageParameter(Name = "hwnd")]int hwnd);

        [OperationContract(Name = "GetItemNames")]
        [return: MessageParameter(Name = "ItemNames")]
        String[] GetItemNames([param: MessageParameter(Name = "hwnd")]int hwnd);

        [OperationContract(Name = "SelectByIndex")]
        void SelectByIndex([param: MessageParameter(Name = "hwnd")]int hwnd, [param: MessageParameter(Name = "index")]int index);

        [OperationContract(Name = "SelectByName")]
        void SelectByName([param: MessageParameter(Name = "hwnd")]int hwnd, [param: MessageParameter(Name = "item")]String item); 
    }
}
