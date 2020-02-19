package de.dc.spring.mm.editor.template;

import de.dc.spring.mm.Entity;
import de.dc.spring.mm.Field;
import de.dc.spring.mm.editor.template.IGenerator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class EntityTemplate implements IGenerator<Entity> {
  @Override
  public String gen(final Entity input) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import java.time.*;");
    _builder.newLine();
    _builder.append("import javax.persistence.*;");
    _builder.newLine();
    StringConcatenation _builder_1 = new StringConcatenation();
    {
      Entity _superClass = input.getSuperClass();
      boolean _tripleNotEquals = (_superClass != null);
      if (_tripleNotEquals) {
        _builder_1.append(" extends ");
        Entity _superClass_1 = input.getSuperClass();
        _builder_1.append(_superClass_1);
      }
    }
    final String baseClass = _builder_1.toString();
    _builder.newLineIfNotEmpty();
    _builder.append("@Entity");
    _builder.newLine();
    _builder.append("public class ");
    String _firstUpper = StringExtensions.toFirstUpper(input.getName());
    _builder.append(_firstUpper);
    _builder.append(baseClass);
    _builder.append("{");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    {
      EList<Field> _fields = input.getFields();
      for(final Field field : _fields) {
        {
          boolean _isIsId = field.isIsId();
          if (_isIsId) {
            _builder.append("\t");
            _builder.append("@Id");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("@GeneratedValue");
            _builder.newLine();
          }
        }
        _builder.append("\t");
        _builder.append("private ");
        String _datatype = field.getDatatype();
        _builder.append(_datatype, "\t");
        _builder.append(" ");
        String _firstLower = StringExtensions.toFirstLower(field.getName());
        _builder.append(_firstLower, "\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@ManyToMany(cascade = CascadeType.ALL)");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@JoinTable(name = \"user_usergroup\",");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("joinColumns = @JoinColumn(name = \"user_id\", referencedColumnName = \"id\"),");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("inverseJoinColumns = @JoinColumn(name = \"usergroup_id\", referencedColumnName = \"id\"))");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private List<UserGroup> userGroups;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public ");
    String _firstUpper_1 = StringExtensions.toFirstUpper(input.getName());
    _builder.append(_firstUpper_1, "\t");
    _builder.append("() {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public ");
    String _firstUpper_2 = StringExtensions.toFirstUpper(input.getName());
    _builder.append(_firstUpper_2, "\t");
    _builder.append("(String firstname, String lastname, UserGroup... userGroups) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("this.firstname = firstname;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.lastname = lastname;");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("this.userGroups = Stream.of(userGroups).collect(Collectors.toList());");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("this.userGroups.forEach(x -> x.getUsers().add(this));");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append(".....");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
}
