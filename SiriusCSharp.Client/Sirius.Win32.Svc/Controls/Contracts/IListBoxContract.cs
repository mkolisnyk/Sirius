using System;
using System.ServiceModel;
namespace Sirius.Win32.Svc.Controls
{
    [ServiceContract(Namespace = "Sirius.Win32.Svc.Controls", Name="ListBox")]
    public interface IListBoxContract
    {
        [OperationContract]
        void AddSelectionByIndex([param: MessageParameter(Name = "hwnd")]int hwnd, [param: MessageParameter(Name = "index")]int index);
        [OperationContract]
        void AddSelectionByName([param: MessageParameter(Name = "hwnd")]int hwnd, [param: MessageParameter(Name = "item")]string item);
        [OperationContract]
        void DeselectAll([param: MessageParameter(Name = "hwnd")]int hwnd);
        [OperationContract]
        string[] GetItemNames([param: MessageParameter(Name = "hwnd")]int hwnd);
        [OperationContract]
        int GetItemsCount([param: MessageParameter(Name = "hwnd")]int hwnd);
        [OperationContract]
        int GetSelectedIndex([param: MessageParameter(Name = "hwnd")]int hwnd);
        [OperationContract]
        string GetSelectedItem([param: MessageParameter(Name = "hwnd")]int hwnd);
        [OperationContract]
        string[] GetSelectedItems([param: MessageParameter(Name = "hwnd")]int hwnd);
        [OperationContract]
        void RemoveSelectionByIndex([param: MessageParameter(Name = "hwnd")]int hwnd, [param: MessageParameter(Name = "index")]int index);
        [OperationContract]
        void RemoveSelectionByName([param: MessageParameter(Name = "hwnd")]int hwnd, [param: MessageParameter(Name = "item")]string item);
        [OperationContract]
        void SelectByIndex([param: MessageParameter(Name = "hwnd")]int hwnd, [param: MessageParameter(Name = "index")]int index);
        [OperationContract]
        void SelectByName([param: MessageParameter(Name = "hwnd")]int hwnd, [param: MessageParameter(Name = "item")]string item);
        [OperationContract]
        void SelectAll([param: MessageParameter(Name = "hwnd")]int hwnd);
    }
}
