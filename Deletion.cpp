#include <algorithm>
#include <iostream>
using namespace std;

class Node{
  public:
  int data;
  Node* next;
  
  Node(int data){
    this->data = data;
    this->next = NULL;
  }
};
void printList(Node* &head){
  Node* temp = head;
  while(temp != NULL){
    cout << temp->data << " " ;
    temp = temp->next ;
  }
  cout << '\n';
}
void  InsertAtFront(Node* &head,int data){
  Node* newNode = new Node(data);
  newNode->next = head;
  head = newNode;
}
void  InsertAtLast(Node* &tail,int data){
  Node* newNode = new Node(data);
  tail->next = newNode;
  tail = newNode;
}

void InsertInBetween(Node* &tail,Node* &head,int data,int pos){
  if(pos==1){
    InsertAtFront(head,data) ;
    return;
  }
  Node *temp = head;
  
  if(temp->next==NULL){
    InsertAtLast(tail,data);
    return;
  }
  Node* newNode = new Node(data);
  
  for(int i=1;i<pos-1;i++){
    temp = temp->next;
  }
  newNode->next = temp->next;
  temp->next = newNode; 
}
void DeleteNode(Node* &head,Node* &tail,int pos){
  Node* temp = head;
  
  if(pos==1){
    head = head->next;
    temp->next = NULL;
    return;
  }
  for(int i=1;i<pos-1;i++){
    temp=temp->next;
  }
  Node* tempnext = temp->next;
  
  temp->next = tempnext->next;
  tempnext->next = NULL ;
}

int main() {
  Node* node1 = new Node(10);
  Node* head = node1;
  Node* tail = node1;
  InsertAtLast(tail,23);
  InsertAtFront(head,90);
  InsertAtLast(tail,34);
  InsertInBetween(tail,head,333,1);
  InsertInBetween(tail,head,445,4);
  InsertInBetween(tail,head,111,4);
  printList(head);
  DeleteNode(head,tail,1);
  printList(head);
  cout << "\nhead " << head->data ;
  cout << " tail "<< tail->data << endl;
  return 0;
}
